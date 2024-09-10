/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.br.felipe.guimaraes.kafka.producer.dto;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MessageAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3857685596636730280L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageAvro\",\"namespace\":\"com.br.felipe.guimaraes.kafka.producer.dto\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageAvro> ENCODER =
      new BinaryMessageEncoder<MessageAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageAvro> DECODER =
      new BinaryMessageDecoder<MessageAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MessageAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MessageAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MessageAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MessageAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MessageAvro from a ByteBuffer. */
  public static MessageAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageAvro() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param message The new value for message
   */
  public MessageAvro(java.lang.CharSequence id, java.lang.CharSequence message) {
    this.id = id;
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new MessageAvro RecordBuilder.
   * @return A new MessageAvro RecordBuilder
   */
  public static com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder newBuilder() {
    return new com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder();
  }

  /**
   * Creates a new MessageAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageAvro RecordBuilder
   */
  public static com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder newBuilder(com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder other) {
    return new com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder(other);
  }

  /**
   * Creates a new MessageAvro RecordBuilder by copying an existing MessageAvro instance.
   * @param other The existing instance to copy.
   * @return A new MessageAvro RecordBuilder
   */
  public static com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder newBuilder(com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro other) {
    return new com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder(other);
  }

  /**
   * RecordBuilder for MessageAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageAvro>
    implements org.apache.avro.data.RecordBuilder<MessageAvro> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MessageAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.message)) {
        this.message = data().deepCopy(fields()[1].schema(), other.message);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }

    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.message = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro.Builder clearMessage() {
      message = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageAvro build() {
      try {
        MessageAvro record = new MessageAvro();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.message = fieldSetFlags()[1] ? this.message : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageAvro>
    READER$ = (org.apache.avro.io.DatumReader<MessageAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
