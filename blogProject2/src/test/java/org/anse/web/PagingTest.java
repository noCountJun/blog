package org.anse.web;

public class PagingTest {
	public int w_size = 10; // ������ �� �Լ�
	public int p_size = 10; // ������ ����
	public int writing_Count = 0;

	public int cur_Page = 0;

	public PagingTest(int w_size, int p_size, int writing_Count, int cur_Page) {
		super();
		this.w_size = w_size;
		this.p_size = p_size;
		this.writing_Count = writing_Count;
		this.cur_Page = cur_Page;
	}

	// �� ������ ����
	public int getPage_Count() {
		return ((writing_Count - 1) / w_size) + 1;
	}

	public int getPage_Start() {
		return ((cur_Page - 1) / p_size) * p_size + 1;
	}

	public int getPage_End() {
		return Math.min(getPage_Start() + p_size - 1, getPage_Count());
	}

	public boolean isPre() {
		return getPage_Start() != 1;
	}

	public boolean isNext() {
		return getPage_End() < getPage_Count();
	}

	public int getWriting_Start() {
		return getWriting_End() - w_size + 1;
	}

	public int getWriting_End() {
		return cur_Page * w_size;
	}

	
	
	public static void main(String[] args) {

		// �������� �Ű������� �׽�Ʈ �غ��ñ� �ٶ��ϴ�.
		PagingTest pg = new PagingTest(5, 5, 26, 6);
		// �� ���� ������ select count(*) from board �ϸ� �������� ,
		// ���� ���� �ִ� ������ ��ȣ�� Default 1, �׸��� �ؿ� ����¡���� ��ũ �ɸ� i�� ���� �������� �˴ϴ�.

		// Paging pg = new Paging(�� ȭ�鿡 ������ �� �� , ������ ���� �� , �� ���� ���� , ���� ���� �ִ� ������ ��ȣ
		// );

		System.out.println("�� ������ ���� : " + pg.getPage_Count());
		System.out.println("������ ���� ����  : " + pg.getPage_Start());
		System.out.println("������ ������ ����  : " + pg.getPage_End());
		System.out.println("Pre ǥ�� ����  : " + pg.isPre());
		System.out.println("Next ǥ�� ����   : " + pg.isNext());
		System.out.println("�� ���� ���� ��ȣ   : " + pg.getWriting_Start());
		System.out.println("�� ���� �� ��ȣ   : " + pg.getWriting_End());

		System.out.println(
				"select * from board where no between " + pg.getWriting_Start() + " and " + pg.getWriting_End());
		// �� ����Ʈ ����� ȭ�鿡 �Ѹ� �Ŀ�

		// �ؿ��� ����¡�� �ϸ� �ǰ���? �̰ſ� ��ũ�� �ɰ� i�� ���� ������ ��ȣ�μ� ��ũ�� �ɸ��� �ǰ���?
		if (pg.isPre())
			System.out.print(" Pre ");
		for (int i = pg.getPage_Start(); i <= pg.getPage_End(); i++) {
			System.out.print(" " + i + " ");
		}
		if (pg.isNext())
			System.out.print(" Next ");

		// �̷� ����¡ Ŭ������ �ۼ��Ͽ� ����ϴ� ���� ������� ���մϴ�. ~ ����

	}
}
