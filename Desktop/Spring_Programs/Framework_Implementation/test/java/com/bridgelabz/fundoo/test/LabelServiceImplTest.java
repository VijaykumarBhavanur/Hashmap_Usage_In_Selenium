package com.bridgelabz.fundoo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bridgelabz.fundoo.note.dto.LabelDTO;
import com.bridgelabz.fundoo.note.model.Label;
import com.bridgelabz.fundoo.note.repository.ILabelRepository;
import com.bridgelabz.fundoo.note.service.LabelServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabelServiceImplTest {
	private MockMvc mockmvc;

	@InjectMocks
	LabelServiceImpl labelImpl;

	@Mock
	ILabelRepository labelRepository;

	@Mock
	LabelDTO labelDTO;

	@Mock
	ModelMapper modelMapper;

	Label label = new Label("1", "user@gmail.com", "label1", null);

	@Before
	public void Setup() throws Exception {
		mockmvc = MockMvcBuilders.standaloneSetup(labelImpl).build();
	}

	/**
	 * Test case for create label api
	 */
	@Test
	public void createLabelTest() {
		labelDTO.setLabelName("Junit");
// Optional<Label> already = Optional.of(label);
		when(modelMapper.map(labelDTO, Label.class)).thenReturn(label);
		when(labelRepository.save(label)).thenReturn(label);
	}

	/**
	 * Test case for update label api..
	 */
	@Test
	public void updateLabelTest() {
// Optional<Label> already = Optional.of(label);
		label.setLabelName("7 wonders in world....");
		when(labelRepository.save(label)).thenReturn(label);
	}
test
	/**
	 * Test case for delete label api
	 */
	@Test
	public void deleteLabelTest() {

		List<Label> label1 = null;
		String labelId = "5dba69b03f43761e31622cbe";
		String emailId = "pratikshatamadalge21@gmail.com";
// Optional<Label> already = Optional.of(label);
		when(labelRepository.findByEmailId(emailId)).thenReturn(label1);
		labelRepository.deleteById(labelId);

	}

	/**
	 * Test case to fetch all label api
	 */
	@Test
	public void getLabelTest() {
		List<Label> label1 = null;
		String emailId = "pratikshatamadalge21@gmail.com";
		Optional<Label> already = Optional.of(label);
		when(labelRepository.findByEmailId(emailId)).thenReturn(label1);
		assertEquals(label.getEmailId(), already.get().getEmailId());
	}
}
