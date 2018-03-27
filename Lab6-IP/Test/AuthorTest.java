import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @org.junit.jupiter.api.Test
    void getName() {

        Author author = new Author("Vincent Van Gogh");
        assertEquals("Vincent Van Gogh", author.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {




    }


}