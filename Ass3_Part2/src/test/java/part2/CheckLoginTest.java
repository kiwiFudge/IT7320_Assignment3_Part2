package part2;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.mockito.*;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gui.CheckLogin;
import junit.framework.TestCase;

public class CheckLoginTest extends TestCase{

	 @Mock
	 HttpServletRequest request;
	 @Mock
	 HttpServletResponse response;
	 
	CheckLogin obj;
	String un;
	String pw;
	
	StringWriter stringWriter;
	PrintWriter writer;
	
	@Before
	public void setUp() throws Exception {
		obj = new CheckLogin();
		un = "admin";
		pw = "admin";
		
		request = Mockito.mock(HttpServletRequest.class);       
        response = Mockito.mock(HttpServletResponse.class);
        
        Mockito.when(request.getParameter("username")).thenReturn("admin");
        Mockito.when(request.getParameter("password")).thenReturn("admin");
        
        stringWriter = new StringWriter();
        writer = new PrintWriter(stringWriter);
        
        Mockito.when(response.getWriter()).thenReturn(writer);
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		obj.doPost(request, response);
		assertEquals(true, obj.result);
	}
}
