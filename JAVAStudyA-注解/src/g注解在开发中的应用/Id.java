package gע���ڿ����е�Ӧ��;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * ��һ������ע��Idֻ�ܱ�ע�����ϣ����ұ�@Id��ע�����б�����һ��int���͵�id�ֶ�
 * 			���߾ͻᱨ�쳣
 */
//���ע����Ա�������ƶ�ȡ��
@Retention(RetentionPolicy.RUNTIME)

//���ע��ֻ�ܱ�ע������
@Target(ElementType.TYPE)
public @interface Id {

}
