package com.samusof.tracklanguagetrack.genius;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeniusApiClientTest {

    @Mock
    private Logger logger;

    private GeniusApiClient client;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        this.client = spy(new GeniusApiClient());
        when(client.logger()).thenReturn(logger);
    }

    @Test
    public void givenClientWhenCalledGetArtistMetadatShouldPrintArtist() {
        client.logSomething();
        verify(logger, times(1)).info("Hello world");
    }
}
