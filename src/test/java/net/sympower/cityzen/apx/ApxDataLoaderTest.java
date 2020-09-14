package net.sympower.cityzen.apx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ApxDataLoaderTest {

  @Test
  public void load() throws Exception {
    ApxDataLoader sut = new ApxDataLoader();
    sut.url = getClass().getResource("apx-data.json");
    QuoteResponse response = sut.load();
    assertNotNull(response);
    
    assertNotNull(response.getQuote());
    assertEquals(response.getQuote().size(), 24);
    assertEquals(response.getQuote().get(0).getDate(), "12-11-2019");
    assertEquals(response.getQuote().get(0).getValues().getHour(), "01");
    assertEquals(response.getQuote().get(0).getValues().getPrice().getValue(), new Double("34.0"));
    assertEquals(response.getQuote().get(0).getValues().getNetVolume().getValue(), new Double("4514.20"));
  }
  
}