package com.cg.capstore.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.cg.capstore.beans.CouponsBean;
import com.cg.capstore.beans.FeedbackProductBean;
import com.cg.capstore.beans.ImageBean;
import com.cg.capstore.beans.ProductBean;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	
	@RequestMapping(value = "/")
	public String feedback() {
		return "welcome";
	}

	@RequestMapping(value = "/generatingcoupons", method = RequestMethod.POST)
	public String generatingCoupons(ModelMap model,String emailId, CouponsBean couponsBean)
			 {
		
		model.addAttribute("coupons", couponsBean);
		RestTemplate restTemplate = new RestTemplate();
		String coupons = restTemplate.postForObject("http://localhost:9010/generatingCoupons?emailId="+emailId,couponsBean, String.class);
		return coupons;
	}
	
	//adding feedback:callingback controller
	@RequestMapping(value = "/displayingfeedback", method = RequestMethod.POST)
	public ModelMap addingFeedback(ModelMap model,String productId, FeedbackProductBean feedbackProductBean)
			 {
		
		model.addAttribute("feedback", feedbackProductBean);
		
		System.out.println("feedback"+feedbackProductBean);
		System.out.println("productid"+productId);
		RestTemplate restTemplate = new RestTemplate();
		List<FeedbackProductBean>feedback = restTemplate.postForObject("http://localhost:9010/addingFeedback?productId="+productId,feedbackProductBean, List.class);
		System.out.println("feedback result"+feedback);
		model.put("feedback",feedback);
		return model;
	}
	
	
	@RequestMapping(value = "/addanfeedback", method = RequestMethod.POST)
	public FeedbackProductBean addanfeedback(ModelMap model,String productId, FeedbackProductBean feedbackProductBean)
			 {
		
		model.addAttribute("feedback", feedbackProductBean);
		//model.addAttribute("product", productId);
		System.out.println("feedback"+feedbackProductBean);
		System.out.println("productid"+productId);
		RestTemplate restTemplate = new RestTemplate();
		FeedbackProductBean feedback = restTemplate.postForObject("http://localhost:9010/addFeedback?productId="+productId,feedbackProductBean, FeedbackProductBean.class);
		System.out.println("feedback result"+feedback);
		
		return feedback;
	}
	
	
	@RequestMapping(value = "/uploadingimage", method = RequestMethod.POST)
	public String uploadimage(ModelMap model,String productId, ImageBean image ) throws IOException
			 {
		/*
		File file=new File(imageBean.getImagePath());
		
		byte[] bytesarray=new byte[(int) file.length()];
		FileInputStream fis=new FileInputStream(file);
		fis.read(bytesarray);
		fis.close();
		*/
		
		/*String filepath=imageBean.getImagePath();
		byte[] bfile=Files.readAllBytes(new File(filepath).toPath());
		
		imageBean.setImageData(bfile);
		
		
		System.err.println(imageBean.getImageId());
		System.err.println(imageBean.getImageName());
		System.err.println(imageBean.getImageType());
		System.err.println(imageBean.getImagePath());
		System.err.println(imageBean.getImageData());
*/
		
		
		
		model.addAttribute("image", image);
		//model.addAttribute("product", productId);
		System.out.println("image"+image);
		System.out.println("productid "+productId);
		
		String filepath=image.getImagePath();
		byte[] bfile=Files.readAllBytes(new File(filepath).toPath());
		image.setImageData(bfile);
		
		
		
		RestTemplate restTemplate = new RestTemplate();
		String msg = restTemplate.postForObject("http://localhost:9010/addImage?productId="+productId,image, String.class);
		System.out.println("image result"+msg);
		
		return msg;
	}
	
	@RequestMapping(value="/addingtocart", method = RequestMethod.POST)
	public ModelMap addingToCart(String emailId,String productId,ModelMap model){
		
		RestTemplate restTemplate=new RestTemplate();
		
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("emailId", emailId);
		map.add("productId", productId);
		System.out.println(emailId);
		
		System.out.println(productId);
		System.out.println(map);
		List<ProductBean> cart=restTemplate.postForObject("http://localhost:9010/addProductToCart", map, List.class);
		
		System.out.println(cart);
		model.put("cart", cart);
		return model;
		
	}
	@RequestMapping(value="/removingfromcart", method = RequestMethod.POST)
	public ModelMap removingFromCart(String emailId,String productId,ModelMap model){
		
		RestTemplate restTemplate=new RestTemplate();
		
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("emailId", emailId);
		map.add("productId", productId);
		System.out.println(emailId);
		
		System.out.println(productId);
		List<ProductBean> cart=restTemplate.postForObject("http://localhost:9010/deleteProductFromCart", map, List.class);
		
		System.out.println(cart);
		model.put("cart", cart);
		return model;
		
	}
	
	@RequestMapping(value="/displayingcart", method = RequestMethod.POST)
	public ModelMap displayingCart(String emailId,ModelMap model){
		System.out.println(emailId);
		RestTemplate restTemplate=new RestTemplate();
		List<ProductBean> cart=restTemplate.getForObject("http://localhost:9010/displayCart?emailId="+emailId, List.class);
		model.put("cart", cart);
		return model;		
	}
	
	/* correct one
	 * @RequestMapping(value="/displayingImage", method = RequestMethod.POST)
	public ImageBean displayingImage(String productId){
		
		RestTemplate restTemplate=new RestTemplate();
		ImageBean image=restTemplate.getForObject("http://localhost:9010/imageDisplay?productId="+productId,ImageBean.class);
		return image;
		
	}*/
	
	ResponseEntity<ImageBean> responseEntityImage;
	
	 @RequestMapping(value="/displayingImage", method = RequestMethod.POST)
		public ResponseEntity<ImageBean> displayingImage(String productId){
		 RestTemplate restTemplate=new RestTemplate();
		 responseEntityImage= restTemplate.getForEntity("http://localhost:9010/imageDisplay?productId="+productId, ImageBean.class);
			//responseEntityImage=restTemplate.getForObject("http://localhost:9010/imageDisplay?productId="+productId,ImageBean.class);
			return responseEntityImage;
	 }
	
}
