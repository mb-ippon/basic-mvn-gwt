package com.ippon.formation.gwt.server.rpc;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ippon.formation.gwt.client.domain.bindery.WelcomeRPC;

@RemoteServiceRelativePath("welcome")
public class WelcomeRPCImpl extends RemoteServiceServlet implements WelcomeRPC {

    /**
     * 
     */
    private static final long serialVersionUID = -619419912527968817L;

    @Override
    public String findWelcomeMessage() {
        return "FormationGWTAsync";
    }

}
