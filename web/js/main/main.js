var init = function(){
	$('#dashboardDiv').show();
	$('#membershipDiv').hide();
	$('#statisticsDiv').hide();
};

$('.btn-minimize').click(function(e){
	e.preventDefault();
	var $target = $(this).parent().parent().next('.box-content');
	if($target.is(':visible')) $('i',$(this)).removeClass('icon-chevron-up').addClass('icon-chevron-down');
	else 					   $('i',$(this)).removeClass('icon-chevron-down').addClass('icon-chevron-up');
	$target.slideToggle();
});

// 왼쪽 메뉴에서 dashboard를 클릭했을 때
$('#menu_dashboard').click(function(e){
	e.preventDefault();
	$('#dashboardDiv').show();
	$('#membershipDiv').hide();
	$('#statisticsDiv').hide();
});

//왼쪽 메뉴에서 회원관리를 클릭했을 때
$('#menu_membership').click(function(e){
	e.preventDefault();
	$('#dashboardDiv').hide();
	$('#statisticsDiv').hide();
	
	// 회원 테이블의 모든 데이터를 지운다.
	$('.datatable').dataTable().fnClearTable();
	
	// 회원에 관한 모든 정보를 받아와서 회원 테이블에 채운다.
	$.ajax({
		url:'fillMemberTable'
	}).done(function(data){
		var memberData = JSON.parse(data);
		var action = null;
		for(var i=0; i<memberData.length; i++){
			action = "<a class='btn btn-success' href='#'>" +
					 	"<i class='icon-zoom-in icon-white'></i>View" +                          
					 "</a>"+
					 "<a class='btn btn-info' href='#'>"+
						"<i class='icon-edit icon-white'></i>"+
							"Edit"+                                            
					"</a>"+
					"<a class='btn btn-danger' href='#'>"+
						"<i class='icon-trash icon-white'></i>"+ 
							"Delete"+
					"</a>";
			$('.datatable').dataTable().fnAddData([memberData[i].userId, memberData[i].name, memberData[i].registerDate, memberData[i].email, memberData[i].bookMarkCount, action]);
		}
	});
	
	// 회원 테이블을 화면에 뿌린다.
	$('#membershipDiv').show();
});

//왼쪽 메뉴에서 통계를 클릭했을 때
$('#menu_statistics').click(function(e){
	e.preventDefault();

	$('#statisticsDiv').show();
	$('#membershipDiv').hide();
	$('#dashboardDiv').hide();
});

init();