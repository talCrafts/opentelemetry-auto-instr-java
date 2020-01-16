package io.opentelemetry.auto.instrumentation.grpc.client;

import io.grpc.Metadata;
import io.opentelemetry.auto.instrumentation.api.AgentPropagation;

public final class GrpcInjectAdapter implements AgentPropagation.Setter<Metadata> {

  public static final GrpcInjectAdapter SETTER = new GrpcInjectAdapter();

  @Override
  public void set(final Metadata carrier, final String key, final String value) {
    carrier.put(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), value);
  }
}