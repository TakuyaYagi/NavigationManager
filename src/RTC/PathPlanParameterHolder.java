package RTC;

/**
* RTC/PathPlanParameterHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2014�N9��4�� 22��56��50�b JST
*/

public final class PathPlanParameterHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PathPlanParameter value = null;

  public PathPlanParameterHolder ()
  {
  }

  public PathPlanParameterHolder (RTC.PathPlanParameter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PathPlanParameterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PathPlanParameterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PathPlanParameterHelper.type ();
  }

}