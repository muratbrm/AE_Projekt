package de.bs14.bestellprozess.service;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import de.bs14.bestellprozess.controller.ProductController;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductControllerTest {
	 private MockMvc mockMvc;
	 
	 @Mock
	 private ProductService productService;
	 
	 @InjectMocks
	 private ProductController productController;
	 
	 @Before
	    public void setUp() throws Exception {
	        mockMvc = MockMvcBuilders.standaloneSetup(productController)
	                .build();
	 }

	 	@Test
	 	public void testCreateProduct() {
	 		assertEquals(Integer.valueOf(200), productService.createProduct(null));
	 	}
	 
	 
//	 @Test
//	    public void testCreateProduct() throws Exception {
//
//	        when(productService.createProduct()).thenReturn(200);
//
//	        mockMvc.perform(get("/product/create"))
//	                .andExpect(status().isOk());
//
//	        verify(productService).createProduct();
//	    }
 	
// 	@Test
// 	public void testCreateProduct() throws Exception {
// 		String json= "{\n" + 
// 				"  \"product_id\": 1,\n" + 
// 				"  \"articleNumber\": 353535553,\n" + 
// 				"  \"price\": 30.9,\n" + 
// 				"  \"imagePath\": \"/home/bestellprozess_images/\",\n" + 
// 				"  \"shortText\": \"kurzer Text\",\n" + 
// 				"  \"longText\": \"langer Text\",\n" + 
// 				"  \"headerText\": \"Überschrift\"\n" + 
// 				"}";
// 		mockMvc.perform(get("/product/create").content(json))
// 		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.product_id", Matchers.is("1")))
//		.andExpect(jsonPath("$.articleNumber", Matchers.is("353535553")))
//		.andExpect(jsonPath("$.price", Matchers.is("30.9")))
//		.andExpect(jsonPath("$.imagePath", Matchers.is("/home/bestellprozess_images/")))
//		.andExpect(jsonPath("$.shortText", Matchers.is("kurzer Text\\")))
//		.andExpect(jsonPath("$.longText", Matchers.is("langer Text")))
//		.andExpect(jsonPath("$.headerText", Matchers.is("Überschrift")));
// 	}

}
