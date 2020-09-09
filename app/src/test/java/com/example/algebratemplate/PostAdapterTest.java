package com.example.algebratemplate;


import org.junit.Assert;
import org.junit.Test;


public class PostAdapterTest {

    PostAdapter postAdapter;

    @Test
    public void testOnCreateViewHolder() throws Exception {
        PostViewHolder result = postAdapter.onCreateViewHolder(null, 0);
        Assert.assertEquals(new PostViewHolder(null), result);
    }

    @Test
    public void testOnBindViewHolder() throws Exception {
        postAdapter.onBindViewHolder(new PostViewHolder(null), 0);
    }

    @Test
    public void testGetItemCount() throws Exception {
        int result = postAdapter.getItemCount();
        Assert.assertEquals(0, result);
    }
}