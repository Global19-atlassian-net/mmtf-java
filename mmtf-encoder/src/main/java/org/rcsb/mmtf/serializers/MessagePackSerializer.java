package org.rcsb.mmtf.serializers;

import org.msgpack.jackson.dataformat.MessagePackFactory;
import org.rcsb.mmtf.dataholders.MmtfBean;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * A class to serialize an object to a byte array.
 * The byte array accords to message pack.
 * @author Anthony Bradley
 *
 */
public class MessagePackSerializer {

	public byte[] serialize(MmtfBean object) throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper(new MessagePackFactory());
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		byte[] byteArray = objectMapper.writeValueAsBytes(object);
		return byteArray;
	}
}