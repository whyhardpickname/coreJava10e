package priorityQueue;

import java.util.*;
import java.time.*;

public class PriorityQueueTest
{
	public static void main(String[] args)
	{
		PriorityQueue<LocalDate> pq;
		pq = new PriorityQueue<>();
		pq.add(LocalDate.of(2001, 1, 1));
		pq.add(LocalDate.of(2002, 1, 1));
		pq.add(LocalDate.of(2002, 2, 1));
		pq.add(LocalDate.of(2002, 2, 2));
		
		for (LocalDate date: pq)
		{
			System.out.println(date);
		}
		System.out.println(".............");
		while (!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
}