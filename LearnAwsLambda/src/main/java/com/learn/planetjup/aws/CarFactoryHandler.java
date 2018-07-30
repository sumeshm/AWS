package com.learn.planetjup.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.learn.planetjup.business.Car;
import com.learn.planetjup.business.Model;

public class CarFactoryHandler implements RequestHandler<Model, Car> {

	@Override
	public Car handleRequest(Model request, Context context) {
		context.getLogger().log("Request: " + request);
		
		Car response = new Car();
		response.setModel(request);
		response.setName("Lamdaghini");

		context.getLogger().log("Response: " + response);

		return response;
	}
}
