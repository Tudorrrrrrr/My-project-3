//package grpc.examples.helloworld6;

//public class HelloWorld6Server {

//}


//package grpc.examples.helloworld5;

//public class HelloWorld5Server {

//}

package grpc.examples.smartbuildingwater;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.examples.smartbuildingwater.GreeterGrpc.GreeterImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartBuildingWaterServer extends GreeterImplBase {

	private static final Logger logger = Logger.getLogger(SmartBuildingWaterServer.class.getName());

	public static void main(String[] args) {
		
		SmartBuildingWaterServer greeterserver = new SmartBuildingWaterServer();
		
		int port = 50052;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(greeterserver)
			    .build()
			    .start();
			System.out.println("Server V1.1 Started");
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	@Override
	public void sayHello(HelloRequest request,  StreamObserver<HelloReply> responseObserver) {
		    
		System.out.println("receiving hello request V 1.1");
		
		 HelloReply reply = HelloReply.newBuilder().setMessage("Hi out there " + request.getName()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}

