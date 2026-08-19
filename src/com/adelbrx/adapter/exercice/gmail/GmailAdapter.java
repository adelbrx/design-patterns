package com.adelbrx.adapter.exercice.gmail;

import com.adelbrx.adapter.exercice.EmailProvider;

public class GmailAdapter implements EmailProvider {
    private GmailClient client;

    public GmailAdapter(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
