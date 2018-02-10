/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.distributedlog.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-05-27")
public class AccessControlEntry implements org.apache.thrift.TBase<AccessControlEntry, AccessControlEntry._Fields>, java.io.Serializable, Cloneable, Comparable<AccessControlEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AccessControlEntry");

  private static final org.apache.thrift.protocol.TField DENY_WRITE_FIELD_DESC = new org.apache.thrift.protocol.TField("denyWrite", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField DENY_TRUNCATE_FIELD_DESC = new org.apache.thrift.protocol.TField("denyTruncate", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField DENY_DELETE_FIELD_DESC = new org.apache.thrift.protocol.TField("denyDelete", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField DENY_ACQUIRE_FIELD_DESC = new org.apache.thrift.protocol.TField("denyAcquire", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField DENY_RELEASE_FIELD_DESC = new org.apache.thrift.protocol.TField("denyRelease", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AccessControlEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AccessControlEntryTupleSchemeFactory());
  }

  public boolean denyWrite; // optional
  public boolean denyTruncate; // optional
  public boolean denyDelete; // optional
  public boolean denyAcquire; // optional
  public boolean denyRelease; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DENY_WRITE((short)1, "denyWrite"),
    DENY_TRUNCATE((short)2, "denyTruncate"),
    DENY_DELETE((short)3, "denyDelete"),
    DENY_ACQUIRE((short)4, "denyAcquire"),
    DENY_RELEASE((short)5, "denyRelease");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DENY_WRITE
          return DENY_WRITE;
        case 2: // DENY_TRUNCATE
          return DENY_TRUNCATE;
        case 3: // DENY_DELETE
          return DENY_DELETE;
        case 4: // DENY_ACQUIRE
          return DENY_ACQUIRE;
        case 5: // DENY_RELEASE
          return DENY_RELEASE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DENYWRITE_ISSET_ID = 0;
  private static final int __DENYTRUNCATE_ISSET_ID = 1;
  private static final int __DENYDELETE_ISSET_ID = 2;
  private static final int __DENYACQUIRE_ISSET_ID = 3;
  private static final int __DENYRELEASE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DENY_WRITE,_Fields.DENY_TRUNCATE,_Fields.DENY_DELETE,_Fields.DENY_ACQUIRE,_Fields.DENY_RELEASE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DENY_WRITE, new org.apache.thrift.meta_data.FieldMetaData("denyWrite", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DENY_TRUNCATE, new org.apache.thrift.meta_data.FieldMetaData("denyTruncate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DENY_DELETE, new org.apache.thrift.meta_data.FieldMetaData("denyDelete", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DENY_ACQUIRE, new org.apache.thrift.meta_data.FieldMetaData("denyAcquire", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DENY_RELEASE, new org.apache.thrift.meta_data.FieldMetaData("denyRelease", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AccessControlEntry.class, metaDataMap);
  }

  public AccessControlEntry() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AccessControlEntry(AccessControlEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.denyWrite = other.denyWrite;
    this.denyTruncate = other.denyTruncate;
    this.denyDelete = other.denyDelete;
    this.denyAcquire = other.denyAcquire;
    this.denyRelease = other.denyRelease;
  }

  public AccessControlEntry deepCopy() {
    return new AccessControlEntry(this);
  }

  @Override
  public void clear() {
    setDenyWriteIsSet(false);
    this.denyWrite = false;
    setDenyTruncateIsSet(false);
    this.denyTruncate = false;
    setDenyDeleteIsSet(false);
    this.denyDelete = false;
    setDenyAcquireIsSet(false);
    this.denyAcquire = false;
    setDenyReleaseIsSet(false);
    this.denyRelease = false;
  }

  public boolean isDenyWrite() {
    return this.denyWrite;
  }

  public AccessControlEntry setDenyWrite(boolean denyWrite) {
    this.denyWrite = denyWrite;
    setDenyWriteIsSet(true);
    return this;
  }

  public void unsetDenyWrite() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DENYWRITE_ISSET_ID);
  }

  /** Returns true if field denyWrite is set (has been assigned a value) and false otherwise */
  public boolean isSetDenyWrite() {
    return EncodingUtils.testBit(__isset_bitfield, __DENYWRITE_ISSET_ID);
  }

  public void setDenyWriteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DENYWRITE_ISSET_ID, value);
  }

  public boolean isDenyTruncate() {
    return this.denyTruncate;
  }

  public AccessControlEntry setDenyTruncate(boolean denyTruncate) {
    this.denyTruncate = denyTruncate;
    setDenyTruncateIsSet(true);
    return this;
  }

  public void unsetDenyTruncate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DENYTRUNCATE_ISSET_ID);
  }

  /** Returns true if field denyTruncate is set (has been assigned a value) and false otherwise */
  public boolean isSetDenyTruncate() {
    return EncodingUtils.testBit(__isset_bitfield, __DENYTRUNCATE_ISSET_ID);
  }

  public void setDenyTruncateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DENYTRUNCATE_ISSET_ID, value);
  }

  public boolean isDenyDelete() {
    return this.denyDelete;
  }

  public AccessControlEntry setDenyDelete(boolean denyDelete) {
    this.denyDelete = denyDelete;
    setDenyDeleteIsSet(true);
    return this;
  }

  public void unsetDenyDelete() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DENYDELETE_ISSET_ID);
  }

  /** Returns true if field denyDelete is set (has been assigned a value) and false otherwise */
  public boolean isSetDenyDelete() {
    return EncodingUtils.testBit(__isset_bitfield, __DENYDELETE_ISSET_ID);
  }

  public void setDenyDeleteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DENYDELETE_ISSET_ID, value);
  }

  public boolean isDenyAcquire() {
    return this.denyAcquire;
  }

  public AccessControlEntry setDenyAcquire(boolean denyAcquire) {
    this.denyAcquire = denyAcquire;
    setDenyAcquireIsSet(true);
    return this;
  }

  public void unsetDenyAcquire() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DENYACQUIRE_ISSET_ID);
  }

  /** Returns true if field denyAcquire is set (has been assigned a value) and false otherwise */
  public boolean isSetDenyAcquire() {
    return EncodingUtils.testBit(__isset_bitfield, __DENYACQUIRE_ISSET_ID);
  }

  public void setDenyAcquireIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DENYACQUIRE_ISSET_ID, value);
  }

  public boolean isDenyRelease() {
    return this.denyRelease;
  }

  public AccessControlEntry setDenyRelease(boolean denyRelease) {
    this.denyRelease = denyRelease;
    setDenyReleaseIsSet(true);
    return this;
  }

  public void unsetDenyRelease() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DENYRELEASE_ISSET_ID);
  }

  /** Returns true if field denyRelease is set (has been assigned a value) and false otherwise */
  public boolean isSetDenyRelease() {
    return EncodingUtils.testBit(__isset_bitfield, __DENYRELEASE_ISSET_ID);
  }

  public void setDenyReleaseIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DENYRELEASE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DENY_WRITE:
      if (value == null) {
        unsetDenyWrite();
      } else {
        setDenyWrite((Boolean)value);
      }
      break;

    case DENY_TRUNCATE:
      if (value == null) {
        unsetDenyTruncate();
      } else {
        setDenyTruncate((Boolean)value);
      }
      break;

    case DENY_DELETE:
      if (value == null) {
        unsetDenyDelete();
      } else {
        setDenyDelete((Boolean)value);
      }
      break;

    case DENY_ACQUIRE:
      if (value == null) {
        unsetDenyAcquire();
      } else {
        setDenyAcquire((Boolean)value);
      }
      break;

    case DENY_RELEASE:
      if (value == null) {
        unsetDenyRelease();
      } else {
        setDenyRelease((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DENY_WRITE:
      return isDenyWrite();

    case DENY_TRUNCATE:
      return isDenyTruncate();

    case DENY_DELETE:
      return isDenyDelete();

    case DENY_ACQUIRE:
      return isDenyAcquire();

    case DENY_RELEASE:
      return isDenyRelease();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DENY_WRITE:
      return isSetDenyWrite();
    case DENY_TRUNCATE:
      return isSetDenyTruncate();
    case DENY_DELETE:
      return isSetDenyDelete();
    case DENY_ACQUIRE:
      return isSetDenyAcquire();
    case DENY_RELEASE:
      return isSetDenyRelease();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AccessControlEntry)
      return this.equals((AccessControlEntry)that);
    return false;
  }

  public boolean equals(AccessControlEntry that) {
    if (that == null)
      return false;

    boolean this_present_denyWrite = true && this.isSetDenyWrite();
    boolean that_present_denyWrite = true && that.isSetDenyWrite();
    if (this_present_denyWrite || that_present_denyWrite) {
      if (!(this_present_denyWrite && that_present_denyWrite))
        return false;
      if (this.denyWrite != that.denyWrite)
        return false;
    }

    boolean this_present_denyTruncate = true && this.isSetDenyTruncate();
    boolean that_present_denyTruncate = true && that.isSetDenyTruncate();
    if (this_present_denyTruncate || that_present_denyTruncate) {
      if (!(this_present_denyTruncate && that_present_denyTruncate))
        return false;
      if (this.denyTruncate != that.denyTruncate)
        return false;
    }

    boolean this_present_denyDelete = true && this.isSetDenyDelete();
    boolean that_present_denyDelete = true && that.isSetDenyDelete();
    if (this_present_denyDelete || that_present_denyDelete) {
      if (!(this_present_denyDelete && that_present_denyDelete))
        return false;
      if (this.denyDelete != that.denyDelete)
        return false;
    }

    boolean this_present_denyAcquire = true && this.isSetDenyAcquire();
    boolean that_present_denyAcquire = true && that.isSetDenyAcquire();
    if (this_present_denyAcquire || that_present_denyAcquire) {
      if (!(this_present_denyAcquire && that_present_denyAcquire))
        return false;
      if (this.denyAcquire != that.denyAcquire)
        return false;
    }

    boolean this_present_denyRelease = true && this.isSetDenyRelease();
    boolean that_present_denyRelease = true && that.isSetDenyRelease();
    if (this_present_denyRelease || that_present_denyRelease) {
      if (!(this_present_denyRelease && that_present_denyRelease))
        return false;
      if (this.denyRelease != that.denyRelease)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_denyWrite = true && (isSetDenyWrite());
    list.add(present_denyWrite);
    if (present_denyWrite)
      list.add(denyWrite);

    boolean present_denyTruncate = true && (isSetDenyTruncate());
    list.add(present_denyTruncate);
    if (present_denyTruncate)
      list.add(denyTruncate);

    boolean present_denyDelete = true && (isSetDenyDelete());
    list.add(present_denyDelete);
    if (present_denyDelete)
      list.add(denyDelete);

    boolean present_denyAcquire = true && (isSetDenyAcquire());
    list.add(present_denyAcquire);
    if (present_denyAcquire)
      list.add(denyAcquire);

    boolean present_denyRelease = true && (isSetDenyRelease());
    list.add(present_denyRelease);
    if (present_denyRelease)
      list.add(denyRelease);

    return list.hashCode();
  }

  @Override
  public int compareTo(AccessControlEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDenyWrite()).compareTo(other.isSetDenyWrite());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDenyWrite()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.denyWrite, other.denyWrite);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDenyTruncate()).compareTo(other.isSetDenyTruncate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDenyTruncate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.denyTruncate, other.denyTruncate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDenyDelete()).compareTo(other.isSetDenyDelete());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDenyDelete()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.denyDelete, other.denyDelete);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDenyAcquire()).compareTo(other.isSetDenyAcquire());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDenyAcquire()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.denyAcquire, other.denyAcquire);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDenyRelease()).compareTo(other.isSetDenyRelease());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDenyRelease()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.denyRelease, other.denyRelease);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AccessControlEntry(");
    boolean first = true;

    if (isSetDenyWrite()) {
      sb.append("denyWrite:");
      sb.append(this.denyWrite);
      first = false;
    }
    if (isSetDenyTruncate()) {
      if (!first) sb.append(", ");
      sb.append("denyTruncate:");
      sb.append(this.denyTruncate);
      first = false;
    }
    if (isSetDenyDelete()) {
      if (!first) sb.append(", ");
      sb.append("denyDelete:");
      sb.append(this.denyDelete);
      first = false;
    }
    if (isSetDenyAcquire()) {
      if (!first) sb.append(", ");
      sb.append("denyAcquire:");
      sb.append(this.denyAcquire);
      first = false;
    }
    if (isSetDenyRelease()) {
      if (!first) sb.append(", ");
      sb.append("denyRelease:");
      sb.append(this.denyRelease);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AccessControlEntryStandardSchemeFactory implements SchemeFactory {
    public AccessControlEntryStandardScheme getScheme() {
      return new AccessControlEntryStandardScheme();
    }
  }

  private static class AccessControlEntryStandardScheme extends StandardScheme<AccessControlEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AccessControlEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DENY_WRITE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.denyWrite = iprot.readBool();
              struct.setDenyWriteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DENY_TRUNCATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.denyTruncate = iprot.readBool();
              struct.setDenyTruncateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DENY_DELETE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.denyDelete = iprot.readBool();
              struct.setDenyDeleteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DENY_ACQUIRE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.denyAcquire = iprot.readBool();
              struct.setDenyAcquireIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DENY_RELEASE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.denyRelease = iprot.readBool();
              struct.setDenyReleaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AccessControlEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetDenyWrite()) {
        oprot.writeFieldBegin(DENY_WRITE_FIELD_DESC);
        oprot.writeBool(struct.denyWrite);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDenyTruncate()) {
        oprot.writeFieldBegin(DENY_TRUNCATE_FIELD_DESC);
        oprot.writeBool(struct.denyTruncate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDenyDelete()) {
        oprot.writeFieldBegin(DENY_DELETE_FIELD_DESC);
        oprot.writeBool(struct.denyDelete);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDenyAcquire()) {
        oprot.writeFieldBegin(DENY_ACQUIRE_FIELD_DESC);
        oprot.writeBool(struct.denyAcquire);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDenyRelease()) {
        oprot.writeFieldBegin(DENY_RELEASE_FIELD_DESC);
        oprot.writeBool(struct.denyRelease);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AccessControlEntryTupleSchemeFactory implements SchemeFactory {
    public AccessControlEntryTupleScheme getScheme() {
      return new AccessControlEntryTupleScheme();
    }
  }

  private static class AccessControlEntryTupleScheme extends TupleScheme<AccessControlEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AccessControlEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDenyWrite()) {
        optionals.set(0);
      }
      if (struct.isSetDenyTruncate()) {
        optionals.set(1);
      }
      if (struct.isSetDenyDelete()) {
        optionals.set(2);
      }
      if (struct.isSetDenyAcquire()) {
        optionals.set(3);
      }
      if (struct.isSetDenyRelease()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDenyWrite()) {
        oprot.writeBool(struct.denyWrite);
      }
      if (struct.isSetDenyTruncate()) {
        oprot.writeBool(struct.denyTruncate);
      }
      if (struct.isSetDenyDelete()) {
        oprot.writeBool(struct.denyDelete);
      }
      if (struct.isSetDenyAcquire()) {
        oprot.writeBool(struct.denyAcquire);
      }
      if (struct.isSetDenyRelease()) {
        oprot.writeBool(struct.denyRelease);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AccessControlEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.denyWrite = iprot.readBool();
        struct.setDenyWriteIsSet(true);
      }
      if (incoming.get(1)) {
        struct.denyTruncate = iprot.readBool();
        struct.setDenyTruncateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.denyDelete = iprot.readBool();
        struct.setDenyDeleteIsSet(true);
      }
      if (incoming.get(3)) {
        struct.denyAcquire = iprot.readBool();
        struct.setDenyAcquireIsSet(true);
      }
      if (incoming.get(4)) {
        struct.denyRelease = iprot.readBool();
        struct.setDenyReleaseIsSet(true);
      }
    }
  }

}
