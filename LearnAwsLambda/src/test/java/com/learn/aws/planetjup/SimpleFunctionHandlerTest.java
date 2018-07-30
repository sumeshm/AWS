package com.learn.aws.planetjup;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.learn.planetjup.aws.CarFactoryHandler;
import com.learn.planetjup.business.Car;
import com.learn.planetjup.business.Model;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class SimpleFunctionHandlerTest {

	private static Model request = null;

    @BeforeClass
    public static void createInput() throws IOException {
        request = new Model();
        request.setVariant("Sports");
        request.setYear(2018);
    }

    private Context createContext() {
        TestContext ctx = new TestContext();
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testSimpleFunctionHandler() {
        CarFactoryHandler handler = new CarFactoryHandler();
        Context ctx = createContext();
        
        Car response = handler.handleRequest(request, ctx);

        Assert.assertEquals(request.getVariant(), response.getModel().getVariant());
        Assert.assertEquals(request.getYear(), response.getModel().getYear());
    }
}
