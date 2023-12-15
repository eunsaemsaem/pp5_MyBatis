package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/")
    public String boardList(Model model) {
        List<BoardVO> list = boardService.getBoardList();
        model.addAttribute ("list", list);
        return "list";
    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String addPost(){
//        return "addPostform";
//    }
//
//
//    @RequestMapping(value = "/addok", method = RequestMethod.POST)
//    public String addPostOk (BoardVO vo) {
//        int i = boardService.insertBoard(vo);
//        if (i==0)
//            System.out.println("fail to add data");
//        else
//            System.out.println("success to add data");
//        return "redirect: list";
//    }
//
//
//    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
//    public String editPost(@PathVariable("id") int id, Model model) {
//        BoardVO boardVO = boardService.getBoard(id);
//        model.addAttribute("boardVO", boardVO);
//        return "editform";
//    }
//
//    @RequestMapping(value = "/editok", method = RequestMethod.POST)
//    public String editPostOk(BoardVO vo) {
//        int i = boardService.updateBoard(vo);
//        if (i == 0)
//            System.out.println("fail to edit data");
//        else
//            System.out.println("success to edit data");
//        return "redirect:list";
//    }
//
//    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
//    public String deletePostOk(@PathVariable("id") int id) {
//        int i = boardService.deleteBoard(id);
//        if (i == 0)
//            System.out.println("fail to delete data");
//        else
//            System.out.println("success to delete data");
//        return "redirect:../list";
//    }

}
