package com.kushal.learning.messenger.resources;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kushal.learning.messenger.model.Message;
import com.kushal.learning.messenger.service.MessageService;

@Path("messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public List<Message> getMessages()
	{
		
		return messageService.getAllMessages();
	}
	/*
	 * For APPLICATION_XML there is JAX P which does coonversion while for JSON there is nothing
	 * such that can handle conversion to JSON.
	 * There are different which needs to be included to support different types.
	 * For example for JSON its moxy.
	 * There is message body reader and message body writer.
	 * Message body writes JSON types.
	 */
	@GET
	@Path("{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId){		
		return messageService.getMessage(messageId);
	}
}
