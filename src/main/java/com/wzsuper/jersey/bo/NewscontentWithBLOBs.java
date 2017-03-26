package com.wzsuper.jersey.bo;


import java.io.UnsupportedEncodingException;

public class NewscontentWithBLOBs extends Newscontent {

    private byte[] newcontent;

    private byte[] markdowns;

    public String getNewcontent() throws UnsupportedEncodingException {
        return this.newcontent == null ? "" : new String(newcontent, "UTF-8");
    }

    public void setNewcontent(byte[] newcontent) {
        if(newcontent != null)
            this.newcontent = newcontent;
    }

    public String getMarkdowns() throws UnsupportedEncodingException {
        return this.markdowns == null ? "" : new String(markdowns, "UTF-8");
    }

    public void setMarkdowns(byte[] markdowns) {
        if(markdowns != null)
            this.markdowns = markdowns;
    }
}