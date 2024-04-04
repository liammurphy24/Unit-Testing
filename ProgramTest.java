//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProgramTest {
    @Test
    public void IsPrime_IsValidPrime_ReturnTrue() {
        //Arrange
        //Act
        boolean isPrime = Program.IsPrime(7); 
        //Assert
        assertTrue(isPrime);

    }

    @Test
    public void IsPrime_ZeroValue_ReturnFalse() {
        boolean isPrime = Program.IsPrime(0);

        assertFalse (isPrime);
    }

    @Test
    public void IsPrime_NotValidPrime_ReturnFalse() {
        boolean isPrime =Program.IsPrime(10);
        assertFalse(isPrime);
    }

    @Test
    public void IsPrime_IsNumber9_Returnfalse() {
        boolean isPrime = Program.IsPrime(9);
        assertFalse(isPrime);

    }

    @Test
    public void Special_Input2023_ThrowException() {
        assertThrows(NullPointerException.class, () -> Program.Special(2023));
    }
}
