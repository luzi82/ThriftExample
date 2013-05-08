package com.luzi82.thriftexample;

import org.apache.thrift.TException;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import shared.SharedStruct;
import tutorial.Calculator;
import tutorial.InvalidOperation;
import tutorial.Work;

public class CalcSyncService implements Calculator.Iface {

	@Override
	public SharedStruct getStruct(int key) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ping() throws TException {
		// TODO Auto-generated method stub

	}

	@Override
	public int add(int num1, int num2) throws TException {
		return num1 + num2;
	}

	@Override
	public int calculate(int logid, Work w) throws InvalidOperation, TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void zip() throws TException {
		// TODO Auto-generated method stub

	}

	public static void startServer(
			Calculator.Processor<CalcSyncService> processor) {
		try {
			TServerTransport serverTransport = new TServerSocket(9090);
			// TServer server = new TSimpleServer(
			// new Args(serverTransport).processor(processor));

			// Use this for a multithreaded server
			TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(
					serverTransport).processor(processor));

			System.out.println("Starting the simple server...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		startServer(new Calculator.Processor<CalcSyncService>(
				new CalcSyncService()));
	}

}
