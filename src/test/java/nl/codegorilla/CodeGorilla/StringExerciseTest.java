package nl.codegorilla.CodeGorilla;

import nl.codegorilla.CodeGorilla.model.StringExercise;
import org.junit.jupiter.api.*;

public class StringExerciseTest {
    @DisplayName("1. startsWithTest")
    @Nested
    public class StartsWithTestTest {
        @Test
        public void test1()
        {
            Assertions.assertTrue(new StringExercise().startsWithTest("test"));
        }
        @Test
        public void test2()
        {
            Assertions.assertTrue(new StringExercise().startsWithTest("Test1"));
        }
        @Test
        public void test3()
        {
            Assertions.assertTrue(new StringExercise().startsWithTest("tEST456"));
        }
        @Test
        public void test4()
        {
            Assertions.assertFalse(new StringExercise().startsWithTest("nottest"));
        }
        @Test
        public void test5()
        {
            Assertions.assertFalse(new StringExercise().startsWithTest("alsonotTest"));
        }
        @Test
        public void test6()
        {
            Assertions.assertFalse(new StringExercise().startsWithTest("a"));
        }
    }

    @DisplayName("2. endsWithTest")
    @Nested
    public class EndsWithTestTest {
        @Test
        public void test1()
        {
            Assertions.assertTrue(new StringExercise().endsWithTest("test"));
        }
        @Test
        public void test2()
        {
            Assertions.assertTrue(new StringExercise().endsWithTest("1Test"));
        }
        @Test
        public void test3()
        {
            Assertions.assertTrue(new StringExercise().endsWithTest("456tEST"));
        }
        @Test
        public void test4()
        {
            Assertions.assertFalse(new StringExercise().endsWithTest("test1"));
        }
        @Test
        public void test5()
        {
            Assertions.assertFalse(new StringExercise().endsWithTest("Test456"));
        }
        @Test
        public void test6()
        {
            Assertions.assertFalse(new StringExercise().endsWithTest("a"));
        }
    }

    @DisplayName("3. atLeastTwoCapitalLetterA")
    @Nested
    public class AtLeastTwoCapitalLetterATest {
        @Test
        public void test1()
        {
            Assertions.assertFalse(new StringExercise().atLeastTwoCapitalLetterA("test"));
        }
        @Test
        public void test2()
        {
            Assertions.assertFalse(new StringExercise().atLeastTwoCapitalLetterA("A"));
        }
        @Test
        public void test3()
        {
            Assertions.assertTrue(new StringExercise().atLeastTwoCapitalLetterA("AA"));
        }
        @Test
        public void test4()
        {
            Assertions.assertFalse(new StringExercise().atLeastTwoCapitalLetterA("[a+A]"));
        }
        @Test
        public void test5()
        {
            Assertions.assertTrue(new StringExercise().atLeastTwoCapitalLetterA("[A+A]"));
        }
        @Test
        public void test6()
        {
            Assertions.assertTrue(new StringExercise().atLeastTwoCapitalLetterA("A sentence with a number of letters A"));
        }
    }

    @DisplayName("4. countLetterA")
    @Nested
    public class CountLetterATest {
        @Test
        public void test1()
        {
            Assertions.assertEquals(0, new StringExercise().countLetterA("no"));
        }

        @Test
        public void test2()
        {
            Assertions.assertEquals(1, new StringExercise().countLetterA("only one a in here"));
        }

        @Test
        public void test3()
        {
            Assertions.assertEquals(2, new StringExercise().countLetterA("aa"));
        }

        @Test
        public void test4()
        {
            Assertions.assertEquals(2, new StringExercise().countLetterA("AA"));
        }

        @Test
        public void test5()
        {
            Assertions.assertEquals(3, new StringExercise().countLetterA("aAa"));
        }

        @Test
        public void test6()
        {
            Assertions.assertEquals(3, new StringExercise().countLetterA("A sentence with a number of letters A"));
        }
    }
}
