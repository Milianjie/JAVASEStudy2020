package jiangtang.com.e��if�����������;

/*
 *      �����������(���̿������)if...else
 *      �﷨��
 *          ��һ�ֽṹ��
 *           if(boolean���ʽ){
 *                java���;
 *           }
 *           
 *           �ڶ��ֽṹ��
 *            if(boolean���ʽ){
 *                java���;
 *           }else{
 *                java���;             
 *           }
 *           
 *           �����ֽṹ��
 *            if(boolean���ʽ){
 *                java���;
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }
 *           
 *           �����ֽṹ��
 *           if(boolean���ʽ){
 *                java���;
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else if(boolean���ʽ){
 *                java���;             
 *           }else{
 *                java���;
 *           }
 *           ע�⣺��if�����ֻҪ��һ����ִ֧�У�������if������
 *           ����ĵڶ��͵��Ľṹ���Ա�֤һ����һ����֧���ִ�У���Ϊ���Ƕ���else���
 */



public class IfTest {
	   
	 	public static void main(String[] args){
	 		
	 		boolean isSuccess=true;
	 		if(isSuccess){
	 			System.out.println("��¼�ɹ�");
	 		}else {
 				System.out.println("��¼ʧ��");
 			}
	 		
	 		if(isSuccess)//��֧����У����ֻ��һ��java��䣬�ɰ�{}ȥ��
	 			          // ���Ƽ�����д���ܿ������������͹��ˣ������ɶ��Բ���
	 			System.out.println("��¼�ɹ�");
	 		else 
 				System.out.println("��¼ʧ��");
 			
	 	}
	 	
}
