package com.adelbrx.adapter.exercice;

import com.adelbrx.adapter.exercice.gmail.GmailAdapter;
import com.adelbrx.adapter.exercice.gmail.GmailClient;

public class Demo {
    public static void show() {
        var emailClient = new EmailClient();

        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
