# grpc-calculator-server
A demo web service that provides calculation operations through gRPC protocol

## Installation

### Build
```console
$ mvn clean install
```

### Running
```console
$ mvn spring-boot:run
```

## Usage

The server will expose an gRPC service on `6565` port.

To check how the client can connect see [grpc-calculator-client](https://github.com/robertoduessmann/grpc-calculator-client).

## How it works
1) Create the service definition in a proto file [CalculatorService.proto](https://github.com/robertoduessmann/grpc-calculator-server/tree/master/src/main/proto) 
2) Compile to be able to handle the generated objects
3) Implement the service definition [CalculatorServiceImpl.java](https://github.com/robertoduessmann/grpc-calculator-server/blob/master/src/main/java/com/calculator/grpccalculatorserver/protoimpl/CalculatorServiceImpl.java)
4) Annotate you service with `@GRpcService` (from [grpc-spring-boot-starter](https://github.com/LogNet/grpc-spring-boot-starter))
## License
The MIT License (MIT)