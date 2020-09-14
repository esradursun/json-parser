package net.sympower.cityzen.apx;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<String>{

	private static final long serialVersionUID = -7104352757564903798L;

	private static final String DATE_FORMAT = "dd-MM-yyyy";
	private static final String NL_TIME_ZONE = "nl_NL";
	
	public LocalDateDeserializer() {
		this(null);
	}
	
	public LocalDateDeserializer(Class<LocalDateTime> t) {
		super(t);
	}
	

	@Override
	public String deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone(NL_TIME_ZONE));
		String date = simpleDateFormat.format(new java.util.Date (parser.getLongValue()));
		return date;
	}
}
