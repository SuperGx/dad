// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package eu.ase.rmiweb;

public final class SampleServerImageImpl_Stub
    extends java.rmi.server.RemoteStub
    implements eu.ase.rmiweb.SampleServerImageInterface, java.rmi.Remote
{
    private static final java.rmi.server.Operation[] operations = {
	new java.rmi.server.Operation("byte remoteProcessPictureTime(byte[], java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)[]")
    };
    
    private static final long interfaceHash = 5315442835302670565L;
    
    // constructors
    public SampleServerImageImpl_Stub() {
	super();
    }
    public SampleServerImageImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of remoteProcessPictureTime(byte[], String, String, String, String, int)
    public byte[] remoteProcessPictureTime(byte[] $param_arrayOf_byte_1, java.lang.String $param_String_2, java.lang.String $param_String_3, java.lang.String $param_String_4, java.lang.String $param_String_5, int $param_int_6)
	throws java.rmi.RemoteException
    {
	try {
	    java.rmi.server.RemoteCall call = ref.newCall((java.rmi.server.RemoteObject) this, operations, 0, interfaceHash);
	    try {
		java.io.ObjectOutput out = call.getOutputStream();
		out.writeObject($param_arrayOf_byte_1);
		out.writeObject($param_String_2);
		out.writeObject($param_String_3);
		out.writeObject($param_String_4);
		out.writeObject($param_String_5);
		out.writeInt($param_int_6);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling arguments", e);
	    }
	    ref.invoke(call);
	    byte[] $result;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$result = (byte[]) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling return", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling return", e);
	    } finally {
		ref.done(call);
	    }
	    return $result;
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
