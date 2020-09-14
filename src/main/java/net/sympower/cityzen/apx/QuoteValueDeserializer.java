package net.sympower.cityzen.apx;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class QuoteValueDeserializer extends StdDeserializer<QuoteValue>{
	
	private static final long serialVersionUID = -5940925127397696182L;
	
	private static final String T_LABEL = "tLabel";
	private static final String ORDER = "Order";
	private static final String HOUR = "Hour";
	private static final String VALUE = "value";
	private static final String NET_VOLUME = "Net Volume";
	private static final String UNIT = "unit";
	private static final String PRICE = "Price";

	public QuoteValueDeserializer() {
		this(null);
	}
	
	public QuoteValueDeserializer(Class<QuoteValue> t) {
		super(t);
	}
	
	@Override
	public QuoteValue deserialize(JsonParser parser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		ObjectCodec codec = parser.getCodec();
		JsonNode nodeList = codec.readTree(parser);
		QuoteValue quoteValue = new QuoteValue();
		if(nodeList.isArray()) {
			for(JsonNode node: nodeList) {
				JsonNode valueNode = node.get(T_LABEL);
				if(valueNode.asText().equals(ORDER) || valueNode.asText().equals(HOUR)) {
					quoteValue.setHour(node.get(VALUE).asText());
				} else if(valueNode.asText().equals(NET_VOLUME)){
				   quoteValue.setNetVolume(new NetVolume(node.get(VALUE).asDouble(), node.get(UNIT).asText()));
				} else if(valueNode.asText().equals(PRICE)){
					quoteValue.setPrice(new Price(node.get(VALUE).asDouble(), node.get(UNIT).asText()));
				}
			}
		}
		return quoteValue;
	}
}
