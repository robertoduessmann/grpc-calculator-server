package com.calculator.grpccalculatorserver.protoimpl;

import com.calculator.CalculatorServiceGrpc;
import com.calculator.SumRequest;
import com.calculator.SumResponse;
import com.calculator.grpccalculatorserver.calc.Sum;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        double result = new Sum(request.getNum1(), request.getNum2()).getResult();
        SumResponse response = SumResponse.newBuilder().setResult(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
