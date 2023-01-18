package com.teste;

import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        org.junit.Assert.assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals() {
        org.junit.Assert.assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse() {
        org.junit.Assert.assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame() {
        org.junit.Assert.assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        org.junit.Assert.assertNull(null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
        org.junit.Assert.assertSame(aNumber, aNumber);
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatBothContainsString() {
        org.junit.Assert.assertThat("albumen", org.hamcrest.CoreMatchers.both(org.hamcrest.CoreMatchers.containsString("a")).and(org.hamcrest.CoreMatchers.containsString("b")));
    }

    @Test
    public void testAssertThatHasItems() {
        org.junit.Assert.assertThat(java.util.Arrays.asList("one", "two", "three"), org.hamcrest.CoreMatchers.hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        org.junit.Assert.assertThat(java.util.Arrays.asList(new String[] {"fun", "ban", "net"}), org.hamcrest.CoreMatchers.everyItem(org.hamcrest.CoreMatchers.containsString("n")));
    }

// Core Hamcrest Matchers with assertThat
    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        org.junit.Assert.assertThat("good", org.hamcrest.CoreMatchers.allOf(org.hamcrest.CoreMatchers.startsWith("good"), org.hamcrest.CoreMatchers.endsWith("good")));
        org.junit.Assert.assertThat("good", org.hamcrest.CoreMatchers.anyOf(org.hamcrest.CoreMatchers.startsWith("bad"), org.hamcrest.CoreMatchers.endsWith("good")));
        org.junit.Assert.assertThat("good", org.hamcrest.CoreMatchers.not(org.hamcrest.CoreMatchers.startsWith("bad")));
    }

    @Test
    public void testAssertTrue() {
        org.junit.Assert.assertTrue(true);
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatHamcrestCoreMatchers2() {
        org.junit.Assert.assertThat("good", org.hamcrest.CoreMatchers.not(org.hamcrest.CoreMatchers.equalTo("bad")));
        org.junit.Assert.assertThat(7, org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.equalTo(7)));
        org.junit.Assert.assertThat(7, org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.not(3)));
        org.junit.Assert.assertThat(new Object(), org.hamcrest.CoreMatchers.not(org.hamcrest.CoreMatchers.sameInstance(new Object())));
    }

}
