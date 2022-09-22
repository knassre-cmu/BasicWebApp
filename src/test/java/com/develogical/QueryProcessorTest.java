package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void nameTest() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("teedy-is-tedious"));
    }

    @Test
    public void largestNumberTest() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest:15,112,17,313,42"), containsString("313"));
    }

    @Test
    public void squarCubeTest() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is both a square and a cube:5,25,27,64,3"), containsString("64"));
    }

    @Test
    public void multiplyTest() throws Exception {
        assertThat(queryProcessor.process("what is 6 multiplied by 7"), containsString("42"));
    }

}
