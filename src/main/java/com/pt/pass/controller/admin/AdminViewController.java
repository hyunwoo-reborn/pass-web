package com.pt.pass.controller.admin;

import com.pt.pass.service.packaze.PackageService;
import com.pt.pass.service.pass.BulkPassService;
import com.pt.pass.service.user.UserGroupMappingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminViewController {
    private final BulkPassService bulkPassService;
    private final PackageService packageService;
    private final UserGroupMappingService userGroupMappingService;

    public AdminViewController(BulkPassService bulkPassService, PackageService packageService, UserGroupMappingService userGroupMappingService) {
        this.bulkPassService = bulkPassService;
        this.packageService = packageService;
        this.userGroupMappingService = userGroupMappingService;
    }

    @GetMapping("/bulk-pass")
    public ModelAndView registerBulkPass(ModelAndView modelAndView) {
        // bulk pass 목록 조회
        modelAndView.addObject("bulkPasses", bulkPassService.getAllBulkPasses());
        // bulk pass를 등록할 때 필요한 package 값을 위해 모든 package를 조회
        modelAndView.addObject("packages", packageService.getAllPackages());
        // builk pass를 등록할 때 필요한 userGroupId 값을 위해모든 userGroupId를 조회
        modelAndView.addObject("userGroupIds", userGroupMappingService.getAllUserGroupIds());
        // bulk pass request를 제공
        modelAndView.addObject("request", new BulkPassRequest());
        modelAndView.setViewName("admin/bulk-pass");

        return modelAndView;
    }

    @PostMapping("/bulk-pass")
    public String addBulkPass(@ModelAttribute("request") BulkPassRequest request, Model model) {
        //bulk pass를 생성
        bulkPassService.addBulkPass(request);
        return "redirect:/admin/bulk-pass";
    }
}
