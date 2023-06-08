package org.zerock.bj2.controller;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.bj2.dto.PageRequestDTO;
import org.zerock.bj2.dto.PageResponseDTO;
import org.zerock.bj2.dto.TodoDTO;
import org.zerock.bj2.mappers.TodoMapper;
import org.zerock.bj2.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/sample/")
public class TodoController {
  
  private final TodoService todoService;

  @GetMapping("hello")
  public void hello(PageRequestDTO pageRequestDTO , Model model){

    PageResponseDTO<TodoDTO> pageResponseDTO = todoService.getList(pageRequestDTO);
    model.addAttribute("pageResponseDTO", pageResponseDTO);

  }

  @GetMapping("list")
  public void lteLayout(PageRequestDTO pageRequestDTO , Model model){

    //PageResponseDTO<TodoDTO> pageResponseDTO =  todoMapper.list(pageRequestDTO);
    //model.addAttribute("pageRequestDTO", pageResponseDTO);

    PageResponseDTO<TodoDTO> pageResponseDTO = todoService.getList(pageRequestDTO);
    model.addAttribute("pageResponseDTO", pageResponseDTO);

  }
  
      

}
