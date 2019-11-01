package org.dubbo.consumer;


import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.apache.dubbo.config.spring.ServiceBean;
import org.apache.dubbo.config.spring.schema.DubboNamespaceHandler;
import org.apache.dubbo.monitor.support.MonitorFilter;
import org.apache.dubbo.registry.integration.RegistryDirectory;
import org.apache.dubbo.registry.integration.RegistryProtocol;
import org.apache.dubbo.remoting.exchange.ExchangeServer;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer;
import org.apache.dubbo.remoting.exchange.support.header.HeaderExchanger;
import org.apache.dubbo.remoting.transport.netty4.NettyTransporter;
import org.apache.dubbo.rpc.cluster.Router;
import org.apache.dubbo.rpc.cluster.router.condition.ConditionRouter;
import org.apache.dubbo.rpc.cluster.support.AbstractClusterInvoker;
import org.apache.dubbo.rpc.cluster.support.FailoverCluster;
import org.apache.dubbo.rpc.filter.*;
import org.apache.dubbo.rpc.protocol.ProtocolFilterWrapper;
import org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol;
import org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter;
import org.apache.dubbo.rpc.service.GenericService;

public class DubboMain {
	{
		DubboNamespaceHandler DubboNamespaceHandler;
		ServiceBean ServiceBean;
		ServiceConfig ServiceConfig;
		RegistryProtocol RegistryProtocol_export;
//		DubboProtocol DubboProtocol;
		ExchangeServer ExchangeServer;
		HeaderExchanger HeaderExchanger;
		HeaderExchangeServer HeaderExchangeServer;
		HeaderExchangeHandler HeaderExchangeHandler;
		NettyTransporter NettyTransporter;
		ReferenceBean ReferenceBean;
		ReferenceConfig ReferenceConfig;
		RegistryDirectory RegistryDirectory;
		Router Router;
		ConditionRouter ConditionRouter;
		AbstractClusterInvoker AbstractClusterInvoker;
		FailoverCluster FailoverCluster;
		DubboProtocol DubboProtocol;
		ProtocolFilterWrapper ProtocolFilterWrapper;
		EchoFilter EchoFilter;
		MonitorFilter MonitorFilter;
		FutureFilter FutureFilter;
		AccessLogFilter AccessLogFilter;
		ExecuteLimitFilter ExecuteLimitFilter;
		GenericService GenericService;
		GenericFilter GenericFilter;
		GenericImplFilter GenericImplFilter;
	}

	public static void main(String[] args) {

	}

}
