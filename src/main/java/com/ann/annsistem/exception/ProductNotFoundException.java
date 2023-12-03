package com.ann.annsistem.exception;

public class ProductNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6431519015714079571L;

	public ProductNotFoundException(Long id){
		super("Could not find product");
	}

}
