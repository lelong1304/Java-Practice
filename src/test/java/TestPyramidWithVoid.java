import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)

public class TestPyramidWithVoid {
    @Mock
    private PrintPyramidService printPyramidService; // Mock PrintPyramidService as the dependency

    private Pyramid pyramid;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        pyramid = new Pyramid(printPyramidService);
    }

    @Test
    public void shouldPrintThePyramidWithEvenNumber() {
        // Given
        int n = 6;
        // When
        pyramid.pyramidSolve(n);
        // Then
        Mockito.verify(printPyramidService, Mockito.times(1)).printPyramidEven(n);
    }
    @Test
    public void shouldPrintThePyramidWithOddNumber() {
        // Given
        int n = 5;
        // When
        pyramid.pyramidSolve(n);
        // Then
        Mockito.verify(printPyramidService, Mockito.times(1)).printPyramidOdd(n);
    }

    @Test
    public void shouldGetThePyramidWithOddNumber() {
        // Given
        int n = 5;
        StringBuilder res = new StringBuilder();
        res.append("  *  ").append("\n").append(" *** ").append("\n").append("*****").append("\n");
        Mockito.when(printPyramidService.pyramidOdd(n)).thenReturn(res.toString());
        // When
        String output =  pyramid.getPyramidSolve(n);

        // Then
        Mockito.verify(printPyramidService, Mockito.times(1)).pyramidOdd(n);
        Assert.assertEquals(output,res.toString());
    }

    @Test
    public void shouldGetThePyramidWithEvenNumber() {
        // Given
        int n = 6;
        StringBuilder res = new StringBuilder();
        res.append("******").append("\n").append(" **** ").append("\n").append("  **  ").append("\n");
        Mockito.when(printPyramidService.pyramidEven(n)).thenReturn(res.toString());
        // When
        String output =  pyramid.getPyramidSolve(n);

        // Then
        Mockito.verify(printPyramidService, Mockito.times(1)).pyramidEven(n);
        Assert.assertEquals(output,res.toString());
    }

}
