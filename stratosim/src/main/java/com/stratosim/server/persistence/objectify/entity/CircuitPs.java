package com.stratosim.server.persistence.objectify.entity;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;

@Entity(name = "circuitPs")
@Cache(expirationSeconds = 0)  // no expiration
public class CircuitPs extends AbstractDownloadFormatEntity {
}
