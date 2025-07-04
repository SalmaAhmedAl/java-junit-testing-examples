package com.example.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.unittesting.unittesting.data.ItemRepository;
import com.example.unittesting.unittesting.model.Item;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

	@InjectMocks
	ItemBusinessService business;

	@Mock
	ItemRepository repository;

	@Test
	public void retrieveAllItems_basic() {
		when(repository.findAll())
				.thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10), new Item(3, "Item3", 20, 10)));

		List<Item> items = business.retrieveAllItems();

		assertEquals(100, items.get(0).getValue());
		assertEquals(200, items.get(1).getValue());
	}

}
