/*
 * (C) Copyright 2010-2018 hSenid Mobile Solutions (Pvt) Limited. All Rights Reserved. These materials are unpublished, proprietary, confidential source code of hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET of hSenid Mobile Solutions (Pvt) Limited. hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual property rights in these materials.
 */

package Client;

import Client.TCPClient_Impl.Client_Impl;

import java.io.IOException;

/**
 * Created by archana on 1/30/18.
 */
public class TCPClient2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client_Impl obj_1 = new Client_Impl();

        obj_1.clientGenerator(1);
    }
}
