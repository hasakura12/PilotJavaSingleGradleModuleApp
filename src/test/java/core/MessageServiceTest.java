package core;

import main.java.core.MessageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by asahi02 on 2017-12-05.
 */
public class MessageServiceTest {
    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage() { Assert.assertEquals("Hello World!", messageService.getMessage());
    }

}