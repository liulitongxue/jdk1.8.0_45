package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerNotRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u45/3627/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, April 30, 2015 12:31:43 PM PDT
*/

public final class ServerNotRegistered extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerNotRegistered ()
  {
    super(ServerNotRegisteredHelper.id());
  } // ctor

  public ServerNotRegistered (String _serverId)
  {
    super(ServerNotRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotRegistered (String $reason, String _serverId)
  {
    super(ServerNotRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotRegistered
