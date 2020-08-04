
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommentTest
{
    @Test
    public void testAddComment()
    {
        String c = "Great video";
        Comment comment = new Comment();
        assertEquals("Great video", comment.addComment(c));
    }

}
