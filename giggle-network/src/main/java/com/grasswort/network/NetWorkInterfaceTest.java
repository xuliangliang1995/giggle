package com.grasswort.network;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.*;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.List;

/**
 * @author xuliangliang
 * @Description
 * @Date 2021/1/6
 */
public class NetWorkInterfaceTest {

    public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = networkInterfaces.nextElement();
            printNetworkInterface(networkInterface);
        }
    }

    private static void printNetworkInterface(NetworkInterface networkInterface) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("name:%s\n", networkInterface.getName()));
        sb.append(String.format("index:%d\n", networkInterface.getIndex()));
        sb.append(String.format("displayName:%s\n", networkInterface.getDisplayName()));
        sb.append(String.format("MTU:%d\n", networkInterface.getMTU()));
        sb.append(String.format("HardwareAddress:%s\n", networkInterface.getHardwareAddress()));

        sb.append("inetAddresses:\n");
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddress = inetAddresses.nextElement();
            sb.append("\taddress:").append(inetAddress.getAddress().toString()).append("\n");
            sb.append("\thostName:").append(inetAddress.getHostName()).append("\n");
            sb.append("\thostAddress:").append(inetAddress.getHostAddress()).append("\n");
            sb.append("\tcanonicalHostName;").append(inetAddress.getCanonicalHostName()).append("\n");
        }

        sb.append("interfaceAddresses:\n");
        List<InterfaceAddress> interfaceAddressList = networkInterface.getInterfaceAddresses();
        for (InterfaceAddress interfaceAddress : interfaceAddressList) {
            sb.append("\taddress:").append(interfaceAddress.getAddress()).append("\n");
            sb.append("\tbroadcast:").append(interfaceAddress.getBroadcast()).append("\n");
        }

        Enumeration<NetworkInterface> subNetworkInterfaces = networkInterface.getSubInterfaces();
        boolean hasSubElements = subNetworkInterfaces.hasMoreElements();
        if (hasSubElements) {
            sb.append("subNetworkInterfaces:\n");
        }
        while (subNetworkInterfaces.hasMoreElements()) {
            printNetworkInterface(subNetworkInterfaces.nextElement());
        }

        System.out.println(sb.toString());
    }
}
