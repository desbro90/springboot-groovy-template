package sample.controllers

import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

import static org.testng.Assert.assertEquals

class SampleControllerTest {

    static final def SAMPLE_TEXT = 'test'

    SampleController subject

    @BeforeClass
    def setUp() {
        subject = new SampleController()
    }

    @Test
    void "Ensure Text Returned"() {
        subject.setText(SAMPLE_TEXT)
        assertEquals(subject.index(), SAMPLE_TEXT)
    }
}
