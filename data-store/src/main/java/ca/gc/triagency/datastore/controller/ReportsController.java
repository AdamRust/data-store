package ca.gc.triagency.datastore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.gc.triagency.datastore.service.ReportService;

@Controller
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	ReportService reportService;

	// @ResponseBody
	// @RequestMapping(path = "/orgs", method = RequestMethod.GET)
	// public List<Organization> getAllOrganizations() {
	// return dataService.getAllOrganizations();
	// }

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		// model.addAttribute("orgs",
		// dataService.getAllOrganizationsWithLinkNum());
		return "reports/home";
	}

	@GetMapping(value = "/applicationsPerOrganization")
	public String viewProgram(Model model) {
		model.addAttribute("rows", reportService.getApplicationsPerOrganization());
		model.addAttribute("approvedDatasets", reportService.getApprovedDatasets());
		return "reports/applicationsPerOrg";
	}
}