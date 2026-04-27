package com.banking.ms.bankingmsclients.util;

import com.banking.ms.bankingmsclients.config.TrackingIdFilter;
import org.slf4j.MDC;
import reactor.util.context.ContextView;

public class MdcUtil{

    public static void map(ContextView context){
        String trackId = context.getOrDefault(TrackingIdFilter.TRACK_ID, "No-Id");
        MDC.put(TrackingIdFilter.TRACK_ID, trackId);
    }
}
