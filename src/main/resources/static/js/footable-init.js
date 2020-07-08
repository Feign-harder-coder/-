
$(window).on('load', function() {

	// Row Toggler
	// -----------------------------------------------------------------
	$('#demo-foo-row-toggler').footable();

	// Accordion
	// -----------------------------------------------------------------
	$('#demo-foo-accordion').footable().on('footable_row_expanded', function(e) {
		$('#demo-foo-accordion tbody tr.footable-detail-show').not(e.row).each(function() {
			$('#demo-foo-accordion').data('footable').toggleDetail(this);
		});
	});

	// Pagination
	// -----------------------------------------------------------------
	$('#demo-foo-pagination').footable();
	$('#demo-show-entries').on('change', function (e) {
		e.preventDefault();
		var pageSize = $(this).val();
		$('#demo-foo-pagination').data('page-size', pageSize);
		$('#demo-foo-pagination').trigger('footable_initialized');
	});

	// Filtering
	// -----------------------------------------------------------------
	var filtering = $('#demo-foo-filtering');
	filtering.footable().on('footable_filtering', function (e) {
		var selected = $('#demo-foo-filter-status').find(':selected').val();
		e.filter += (e.filter && e.filter.length > 0) ? ' ' + selected : selected;
		e.clear = !e.filter;
	});

	// Filter status
	$('#demo-foo-filter-status').on('change', function (e) {
		e.preventDefault();
		filtering.trigger('footable_filter', {filter: $(this).val()});
	});

	// Search input
	$('#demo-foo-search').on('input', function (e) {
		e.preventDefault();
		filtering.trigger('footable_filter', {filter: $(this).val()});
	});


	

	// Search input
	$('#demo-input-search2').on('input', function (e) {
		e.preventDefault();
		addrow.trigger('footable_filter', {filter: $(this).val()});
	});
	
	// Add & Remove Row
	var addrow = $('#demo-foo-addrow');
	addrow.footable().on('click', '.delete-row-btn', function() {

		//get the footable object
		var footable = addrow.data('footable');

		//get the row we are wanting to delete
		var row = $(this).parents('tr:first');

		//delete the row
		footable.removeRow(row);
	});
    var addrow = $('#demo-foo-addrow2');
	addrow.footable().on('click', '.delete-row-btn', function() {

		//get the footable object
		var footable = addrow.data('footable');

		//get the row we are wanting to delete
		var row = $(this).parents('tr:first');

		//delete the row
		footable.removeRow(row);
	});
	// Add Row Button
	$('#demo-btn-addrow').on('click', function() {

		//get the footable object
		var footable = addrow.data('footable');
		
		//build up the row we are wanting to add
		var newRow = '<tr><td>thome</td><td>Woldt</td><td>Airline Transport Pilot</td><td>3 Oct 2016</td><td><span class="label label-table label-success">Active</span></td><td><button type="button" class="btn btn-sm btn-icon btn-pure btn-outline delete-row-btn" data-toggle="tooltip" data-original-title="Delete"><i class="ti-close" aria-hidden="true"></i></button></td></tr>';

		//add it
		footable.appendRow(newRow);
	});
    
        $('.footable .pagination li').addClass('page-item');
        $('.footable .pagination li a').addClass('page-link');
    
	
	
	
	/*************************************************************************************/
	// -->Template Name: Bootstrap Press Admin
	// -->Author: Themedesigner
	// -->Email: niravjoshi87@gmail.com
	// -->File: datatable_basic_init
	/*************************************************************************************/
	
	/****************************************
	 *       Basic Table                   *
	 ****************************************/
	$('#zero_config').DataTable();
	$('#zero_configgg').DataTable();
	$('#latest_config').DataTable();
	
	/****************************************
	 *       Default Order Table           *
	 ****************************************/
	$('#default_order').DataTable({
	    "order": [
	        [3, "desc"]
	    ]
	});
	
	/****************************************
	 *       Multi-column Order Table      *
	 ****************************************/
	$('#multi_col_order').DataTable({
	    columnDefs: [{
	        targets: [0],
	        orderData: [0, 1]
	    }, {
	        targets: [1],
	        orderData: [1, 0]
	    }, {
	        targets: [4],
	        orderData: [4, 0]
	    }]
	});
	
	/****************************************
	 *       Complex header Table          *
	 ****************************************/
	$('#complex_header').DataTable();
	
	/****************************************
	 *       DOM positioning Table         *
	 ****************************************/
	$('#DOM_pos').DataTable({
	    "dom": '<"top"i>rt<"bottom"flp><"clear">'
	});
	
	/****************************************
	 *     alternative pagination Table    *
	 ****************************************/
	$('#alt_pagination').DataTable({
	    "pagingType": "full_numbers"
	});
	
	/****************************************
	 *     vertical scroll Table    *
	 ****************************************/
	$('#scroll_ver').DataTable({
	    "scrollY": "300px",
	    "scrollCollapse": true,
	    "paging": false
	});
	
	/****************************************
	 * vertical scroll,dynamic height Table *
	 ****************************************/
	$('#scroll_ver_dynamic_hei').DataTable({
	    scrollY: '50vh',
	    scrollCollapse: true,
	    paging: false
	});
	
	/****************************************
	 *     horizontal scroll Table    *
	 ****************************************/
	$('#scroll_hor').DataTable({
	    "scrollX": true
	});
	
	/****************************************
	 * vertical & horizontal scroll Table  *
	 ****************************************/
	$('#scroll_ver_hor').DataTable({
	    "scrollY": 300,
	    "scrollX": true
	});
	
	/****************************************
	 * Language - Comma decimal place Table  *
	 ****************************************/
	$('#lang_comma_deci').DataTable({
	    "language": {
	        "decimal": ",",
	        "thousands": "."
	    }
	});
	
	/****************************************
	 *         Language options Table      *
	 ****************************************/
	$('#lang_opt').DataTable({
	    "language": {
	        "lengthMenu": "Display _MENU_ records per page",
	        "zeroRecords": "Nothing found - sorry",
	        "info": "Showing page _PAGE_ of _PAGES_",
	        "infoEmpty": "No records available",
	        "infoFiltered": "(filtered from _MAX_ total records)"
	    }
	});
	
	
	
	
	
	
	
	
});